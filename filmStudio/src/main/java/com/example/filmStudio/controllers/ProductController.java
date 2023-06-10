package com.example.filmStudio.controllers;


import com.example.filmStudio.models.*;
import com.example.filmStudio.repositories.InfoRepository;
import com.example.filmStudio.repositories.RecordRepository;
import com.example.filmStudio.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final FilmService filmService;
    private final AuthorService authorService;
    private final ReviewService reviewService;
    private final OrderService orderService;
    private final InfoService infoService;
    private final AccountService accountService;
    private final RecordService recordService;
    private final ArtistService artistService;

    @GetMapping("/")
    public String films(@RequestParam(name = "f_name", required = false) String f_name, Model model) {
        model.addAttribute("film", filmService.list(f_name));
        return "products";
    }
    @GetMapping("/reset")
    public String reset(Model model){
        model.addAttribute("film", filmService.list(null));
        return "products";
    }
    @GetMapping("/film/{id}")
    public String film_info(@PathVariable Long id, Model model) {
        model.addAttribute("film", filmService.getFilmById(id));
        model.addAttribute("author", authorService.findById(filmService.getIdAuthor(id)));
        model.addAttribute("film_info", infoService.findById(filmService.getIdInfo(id)));
        return "product-info";
    }
    @GetMapping("/account/{id}")
    public String account_info(@PathVariable Long id, Model model) {
        model.addAttribute("account", accountService.getAccountById(id));
        model.addAttribute("user_record", recordService.findById(id));
        return "account_info";
    }
    @GetMapping("/film/author")
    public String authors(Model model){
        model.addAttribute("author", authorService.list());
        return "author";
    }
    @GetMapping("/film/artist")
    public String artist(Model model){
        model.addAttribute("artist", artistService.list());
        return "artist";
    }
    @GetMapping("/film/review")
    public String review(Model model){
        model.addAttribute("review", reviewService.list());
        return "review";
    }
    @GetMapping("/film/user_order")
    public String user_order(Model model){
        model.addAttribute("user_order", orderService.list());
        return "user_order";
    }
    @GetMapping("/film/account")
    public String account(Model model){
        model.addAttribute("account", accountService.list());
        return "account";
    }
    @PostMapping("/account/create")
    public String createAccount(Account account){
        accountService.createAccount(account);
        return "redirect:/";
    }
    @PostMapping("/author/create")
    public String createAuthor(Author author){
        authorService.createAuthor(author);
        return "redirect:/";
    }
    @PostMapping("/user_order/create")
    public String createOrder(User_order user_order){
        orderService.createOrder(user_order);
        return "redirect:/film/user_order";
    }
    @PostMapping("/author/update/{id}")
    public String updateAuthor(@PathVariable Long id, Author author){
        authorService.updateAuthor(author, id);
        return "redirect:/";
    }
    @PostMapping("/film/update/{id}")
    public String updateFilm(@PathVariable Long id, Film film){
        filmService.updateFilm(film, id);
        return "redirect:/";
    }
    @GetMapping("/film/CreateRec")
    public String createRec(User_record user_record){
        recordService.createRecord(user_record);
        return "redirect:/film/account";
    }
    @PostMapping("/film/create")
    public String createFilm(Film film) {
        filmService.createFilm(film);
        return "redirect:/";
    }
    @PostMapping("/review/create")
    public String createReview(Review review) {
        reviewService.createReview(review);
        return "redirect:/";
    }

    @PostMapping("/film/delete/{id}")
    public String deleteFilm(@PathVariable Long id) {
        filmService.deleteFilm(id);
        return "redirect:/";
    }
    @PostMapping("/account/delete/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return "redirect:/film/account";
    }
    @GetMapping("/author/{id}")
    public String author_info(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorService.findById(id));
        return "author-info";
    }
    @GetMapping("/user_order/{id}")
    public String user_order_info(@PathVariable Long id, Model model) {
        model.addAttribute("user_order", orderService.findById(id));
        return "user_order_info";
    }
    @PostMapping("/user_order/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "redirect:/film/user_order";
    }
    @PostMapping("/user_order/update/{id}")
    public String updateOrder(@PathVariable Long id, User_order user_order){
        orderService.updateOrder(user_order, id);
        return "redirect:/film/user_order";
    }

    @PostMapping("/author/delete/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return "redirect:/film/author";
    }

    @GetMapping("/artist/req")
    public String Request(@RequestParam(name = "current", required = false) Integer current, Model model) {
        model.addAttribute("artist", artistService.listAge(current));
        return "artist";
    }
    @GetMapping("/user_order/sortD")
    public String SortD(Model model) {
        model.addAttribute("user_order", orderService.sortD());
        return "user_order";
    }
    @GetMapping("/user_order/sort")
    public String Sort(Model model) {
        model.addAttribute("user_order", orderService.sort());
        return "user_order";
    }
}
