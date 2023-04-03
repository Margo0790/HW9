public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Германович";
        post.surname = "Иванов";
        post.passport = "777 № 555777";
        post.phone  = "79998887766";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 8;
        post.birthday.month = 8;
        post.birthday.year = 2008;
    }
}
