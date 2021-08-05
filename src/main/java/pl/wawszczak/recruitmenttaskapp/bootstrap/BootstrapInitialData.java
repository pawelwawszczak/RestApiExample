package pl.wawszczak.recruitmenttaskapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;
import pl.wawszczak.recruitmenttaskapp.entity.Position;
import pl.wawszczak.recruitmenttaskapp.entity.Seller;
import pl.wawszczak.recruitmenttaskapp.entity.Shop;
import pl.wawszczak.recruitmenttaskapp.repository.ManagerRepository;
import pl.wawszczak.recruitmenttaskapp.repository.SellerRepository;
import pl.wawszczak.recruitmenttaskapp.repository.ShopRepository;


@Component
public class BootstrapInitialData implements CommandLineRunner {

    private final ManagerRepository managerRepository;
    private final SellerRepository sellerRepository;
    private final ShopRepository shopRepository;

    public BootstrapInitialData(ManagerRepository managerRepository, SellerRepository sellerRepository, ShopRepository shopRepository) {
        this.managerRepository = managerRepository;
        this.sellerRepository = sellerRepository;
        this.shopRepository = shopRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Manager manager = new Manager("Paweł Wawszczak", "1234", Position.MANAGER_BEGINNER, "Polska");
        managerRepository.save(manager);

        Shop shop = new Shop("Sklep1", "Czestochowa", "Sklepowa");
        shopRepository.save(shop);

        Seller seller = new Seller("Sprzedawca", "1111", Position.SELLER_BEGINNER);
        seller.setManager(manager);
        seller.setShop(shop);
        sellerRepository.save(seller);

    }
}
