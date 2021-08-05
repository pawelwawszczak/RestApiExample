package pl.wawszczak.recruitmenttaskapp.service;

import org.springframework.stereotype.Service;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerDto;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerGetDto;

import java.util.Set;

@Service
public interface ManagerService {

    ManagerGetDto getManagerById(Long id);
    ManagerDto createManager(ManagerDto managerDto);
    Set<ManagerDto> getAllManagers();
    ManagerDto updateManager(Long id, ManagerDto managerDto);
    void deleteManager(Long id);
    ManagerDto patchManager(Long id, ManagerDto managerDto);
}
