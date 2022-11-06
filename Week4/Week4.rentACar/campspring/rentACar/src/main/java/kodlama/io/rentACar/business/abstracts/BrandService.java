package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.entities.concretes.Brand;

@Service
public interface BrandService {
	List<Brand> getAll();
}
