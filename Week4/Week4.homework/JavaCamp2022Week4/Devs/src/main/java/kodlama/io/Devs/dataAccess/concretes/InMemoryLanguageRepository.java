package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));

	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getById(int id) throws Exception {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}
		}
		throw new Exception("Böyle bir kayıt bulunamadı");
	}

	@Override
	public void create(Language language) throws Exception {
		languages.add(language);
	}

	@Override
	public void delete(int id) throws Exception {
		Language language1 = getById(id);
		languages.remove(language1);

	}

	@Override
	public void update(Language language, int id) throws Exception {
		Language language1 = getById(language.getId());
		language1.setName(language.getName());
	}

}
