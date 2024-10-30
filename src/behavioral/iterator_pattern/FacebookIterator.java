package behavioral.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {

    private final Facebook facebook;
    private final String type;
    private final String email;
    private int currentPosition = 0;
    private final List<String> emails = new ArrayList<>();
    private final List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void LazyLoad() {
        if (emails.isEmpty()) {
            List<String> prof = facebook.RequestProfileFriendsFromFacebook(email, type);
            for (String profile : prof) {
                emails.add(profile);
                profiles.add(null);
            }
        }
    }


    @Override
    public boolean HasNext() {
        LazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile GetNext() {
        if (!HasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.RequestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void Reset() {
        currentPosition = 0;
    }
}