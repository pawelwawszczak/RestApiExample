package pl.wawszczak.recruitmenttaskapp.service.implementation;

import org.springframework.stereotype.Component;
import pl.wawszczak.recruitmenttaskapp.entity.Seller;
import pl.wawszczak.recruitmenttaskapp.repository.SellerRepository;
import pl.wawszczak.recruitmenttaskapp.service.SellerService;

@Component
public class SellerServiceImpl implements SellerService {

    private final SellerRepository sellerRepository;

    public SellerServiceImpl(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

    @Override
    public Seller save(Seller seller) {
        return sellerRepository.save(seller);
    }
}
