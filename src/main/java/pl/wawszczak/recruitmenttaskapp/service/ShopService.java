package pl.wawszczak.recruitmenttaskapp.service;

import org.springframework.stereotype.Service;
import pl.wawszczak.recruitmenttaskapp.entity.Shop;

@Service
public interface ShopService {
    Shop save(Shop shop);
}
