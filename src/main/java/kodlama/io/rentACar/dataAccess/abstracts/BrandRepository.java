package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandRepository { // BrandDao
    //Brand[] getAll();
    List<Brand> getAll(); // getAll 'u çağıran birisi markaları listeler...
}
