package pl.wawszczak.recruitmenttaskapp.entity.mappers;

import org.mapstruct.Mapper;
import pl.wawszczak.recruitmenttaskapp.entity.Manager;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerDto;
import pl.wawszczak.recruitmenttaskapp.entity.dto.ManagerGetDto;

@Mapper(componentModel = "spring")
public interface ManagerMapper {

    ManagerGetDto ManagerToManagerGetDto(Manager manager);

    Manager ManagerDtoToManager(ManagerDto managerDto);

    ManagerDto ManagerToManagerDto(Manager manager);
}
