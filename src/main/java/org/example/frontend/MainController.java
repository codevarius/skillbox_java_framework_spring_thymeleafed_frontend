package org.example.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/genres/index")
    public String genres() {
        return "/genres/index";
    }

    @GetMapping("/books/recent")
    public String booksRecent() {
        return "/books/recent";
    }

    @GetMapping("/books/popular")
    public String booksPopular() {
        return "/books/popular";
    }

    @GetMapping("/books/author")
    public String booksAuthor() {
        return "/books/author";
    }

    @GetMapping("/books/slug")
    public String booksSlug() {
        return "/books/slug";
    }

    @GetMapping("/books/slugmy")
    public String booksSlugMy() {
        return "/books/slugmy";
    }

    @GetMapping("/authors/index")
    public String authorsIndex() {
        return "/authors/index";
    }

    @GetMapping("/authors/slug")
    public String authorsSlug() {
        return "/authors/slug";
    }

    @GetMapping("/genres/slug")
    public String genresSlug() {
        return "/genres/slug";
    }

    @GetMapping("/postponed")
    public String postponed() {
        return "/postponed";
    }

    @GetMapping("/cart")
    public String cart() {
        return "/cart";
    }

    @GetMapping("/signin")
    public String signin() {
        return "/signin";
    }

    @GetMapping("/signup")
    public String signup() {
        return "/signup";
    }

    @GetMapping("/profile")
    public String profile() {
        return "/profile";
    }

    @GetMapping("/documents/index")
    public String documentsIndex() {
        return "/documents/index";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/faq")
    public String faq() {
        return "/faq";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "/contacts";
    }

    @GetMapping("/search")
    public String search() {
        return "/search/index";
    }

    @GetMapping("/my")
    public String my() {
        return "/my";
    }

    @GetMapping("/myarchive")
    public String myArchive() {
        return "/myarchive";
    }
}
