package vko2.java.tehtava1.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import vko2.java.tehtava1.domain.Friend;

@Controller
public class FriendController {

public List<Friend> friends = new ArrayList<>();

@GetMapping("/friends")
public String friendForm(Model model) {
	model.addAttribute("friend", new Friend());
	model.addAttribute("friends", friends);
	return "friend"; 
}

@PostMapping("/friends")
public String friendSubmit(@ModelAttribute Friend friend, Model model) {
	friends.add(friend);
	model.addAttribute("friend", new Friend());
	model.addAttribute("friends", friends);
	return "friend"; //friend.html

} }
