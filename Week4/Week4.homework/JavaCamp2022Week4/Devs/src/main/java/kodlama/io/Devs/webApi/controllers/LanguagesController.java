package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<Language> getAll() {
		return languageService.getAll();

	}

	@GetMapping("/{id}")
	public Language getById(@PathVariable() int id) throws Exception {
		return languageService.getById(id);
	}

	@PostMapping("/add")
	public void create(@RequestBody Language language) throws Exception {
		languageService.create(language);
	}

	@PutMapping("/update")
	public void update(@RequestBody Language language, @PathVariable int id) throws Exception {
		languageService.update(language, id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception {
		languageService.delete(id);
	}
}
