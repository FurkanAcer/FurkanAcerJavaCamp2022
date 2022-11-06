package kodlama.io.Devs.business.concretes;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {

		// İş Kuralları
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);
	}

	@Override
	public void create(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Bu alan boş bırakılamaz");
		}
		for (Language language1 : getAll()) {
			if (language1.getId() == language.getId()) {
				throw new Exception("İsim tekrar edemez");
			}
		}
	languageRepository.create(language);
	}

	@Override
	public void update(Language language, int id) throws Exception {
		if(languageRepository.getById(id) == null){
            throw new Exception("Bu programlama dili sistemde kayıtlı değil.");
        }
        languageRepository.update(language, id);
	}

	@Override
	public void delete(int id) throws Exception {
		languageRepository.delete(id);
	}

}
