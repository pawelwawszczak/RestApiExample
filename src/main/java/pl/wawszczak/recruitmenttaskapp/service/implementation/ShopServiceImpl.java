package pl.wawszczak.recruitmenttaskapp.service.implementation;

import org.springframework.stereotype.Component;
import pl.wawszczak.recruitmenttaskapp.entity.Shop;
import pl.wawszczak.recruitmenttaskapp.repository.ShopRepository;
import pl.wawszczak.recruitmenttaskapp.service.ShopService;

@Component
public class ShopServiceImpl implements ShopService {

    private final ShopRepository shopRepository;

    public ShopServiceImpl(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public Shop save(Shop shop) {
        return shopRepository.save(shop);
    }
}
