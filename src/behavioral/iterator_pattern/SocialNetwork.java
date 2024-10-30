package behavioral.iterator_pattern;

public interface SocialNetwork {

    ProfileIterator CreateFriendIterator(String profileEmail);

    ProfileIterator CreateCoWorkerIterator(String profileEmail);
}