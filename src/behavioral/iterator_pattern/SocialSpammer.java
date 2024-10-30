package behavioral.iterator_pattern;

public class SocialSpammer {

    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void SendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = network.CreateFriendIterator(profileEmail);
        while (iterator.HasNext()) {
            Profile profile = iterator.GetNext();
            SendMessage(profile.GetEmail(), message);
        }
    }

    public void SendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = network.CreateCoWorkerIterator(profileEmail);
        while (iterator.HasNext()) {
            Profile profile = iterator.GetNext();
            SendMessage(profile.GetEmail(), message);
        }
    }

    public void SendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}