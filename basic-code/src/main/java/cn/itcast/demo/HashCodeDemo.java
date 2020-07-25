package cn.itcast.demo;

/**
 * HashCode与equals方法
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        User user = new User();
        int hashCode = user.hashCode();
        String s = user.toString();

        System.out.println(hashCode);
        System.out.println(s);
    }
}
