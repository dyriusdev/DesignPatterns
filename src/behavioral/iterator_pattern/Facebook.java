package behavioral.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {

    private final List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (!cache.isEmpty()) {
            profiles = cache;
        } else {
            profiles = new ArrayList<>();
        }
    }

    public Profile RequestProfileFromFacebook(String profileEmail) {
        SimulateNetworkLatency();
        System.out.println("Facebook: Loading profile '" + profileEmail + "' over the network...");
        return FindProfile(profileEmail);
    }

    public List<String> RequestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        SimulateNetworkLatency();
        System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        Profile profile = FindProfile(profileEmail);
        if (profile != null) {
            return profile.GetContacts(contactType);
        }
        return null;
    }

    private Profile FindProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.GetEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void SimulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ProfileIterator CreateFriendIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator CreateCoWorkerIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}