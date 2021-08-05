package pl.wawszczak.recruitmenttaskapp.service.implementation;

import org.springframework.stereotype.Component;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerDto;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerGetDto;
import pl.wawszczak.recruitmenttaskapp.entity.mappers.ManagerMapper;
import pl.wawszczak.recruitmenttaskapp.repository.ManagerRepository;
import pl.wawszczak.recruitmenttaskapp.service.ManagerService;
import pl.wawszczak.recruitmenttaskapp.exceptions.ManagerNotFoundException;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;
    private ManagerMapper managerMapper;

    public ManagerServiceImpl(ManagerRepository managerRepository, ManagerMapper managerMapper) {
        this.managerRepository = managerRepository;
        this.managerMapper = managerMapper;
    }

    @Override
    public ManagerGetDto getManagerById(Long id) {
        return managerRepository.findById(id).map(manager -> managerMapper.ManagerToManagerGetDto(manager)).orElseThrow(()-> new ManagerNotFoundException());
    }

    @Override
    public ManagerDto createManager(ManagerDto managerDto) {
        Manager manager = managerMapper.ManagerDtoToManager(managerDto);
        managerRepository.save(manager);
        ManagerDto managerDto1 = managerMapper.ManagerToManagerDto(manager);
        return managerDto1;
    }

    @Override
    public Set<ManagerDto> getAllManagers() {
        return managerRepository.findAll().stream().map(manager -> managerMapper.ManagerToManagerDto(manager)).collect(Collectors.toSet());
    }

    @Override
    public ManagerDto updateManager(Long id, ManagerDto managerDto) {
        return managerMapper.ManagerToManagerDto(managerRepository.findById(id).map(manager -> {
            manager.setFullName(managerDto.getFullName());
            manager.setAccountNumber(managerDto.getAccountNumber());
            manager.setRegion(managerDto.getRegion());
            manager.setPosition(managerDto.getPosition());
            return managerRepository.save(manager);
        }).orElseGet(()-> {
            Manager newManager = managerMapper.ManagerDtoToManager(managerDto);
            newManager.setId(id);
            return managerRepository.save(newManager);
        }));

        }

    @Override
    public void deleteManager(Long id) {
        Manager manager = managerRepository.findById(id).orElseThrow(()->new ManagerNotFoundException());
        managerRepository.delete(manager);
    }

    @Override
    public ManagerDto patchManager(Long id, ManagerDto managerDto) {
        return managerMapper.ManagerToManagerDto(managerRepository.findById(id).map(manager -> {

            if(managerDto.getFullName() != null){
                manager.setFullName(managerDto.getFullName());
            }
            if(managerDto.getAccountNumber() != null){
                manager.setAccountNumber(managerDto.getAccountNumber());
            }
            if(managerDto.getRegion() != null){
                manager.setRegion(managerDto.getRegion());
            }
            if(managerDto.getPosition() != null){
                manager.setPosition(managerDto.getPosition());
            }
            return manager;
        }).orElseThrow(()->new ManagerNotFoundException()));
    }
}
