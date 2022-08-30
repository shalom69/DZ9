package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Николай";
        post.passport = "5560 № 7256425";
        post.patronymic = "Петрович";
        post.phone = "+7 (995)-783-39-81";
        post.surname = "Антонович";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}
