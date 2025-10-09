package Proxy;

public class Client {
    public static void main(String[] args) {
        Video video = new CachedVideo("sample_video.mp4");
        video.play();

        video.play();

    }
}
