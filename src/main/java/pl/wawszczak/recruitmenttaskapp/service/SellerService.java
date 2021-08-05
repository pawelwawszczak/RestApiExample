package pl.wawszczak.recruitmenttaskapp.service;

import org.springframework.stereotype.Service;
import pl.wawszczak.recruitmenttaskapp.entity.Seller;

@Service
public interface SellerService {
    Seller save(Seller seller);
}
