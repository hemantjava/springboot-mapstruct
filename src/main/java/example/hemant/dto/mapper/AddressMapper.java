package example.hemant.dto.mapper;

import example.hemant.dto.AddressDto;
import example.hemant.entity.Address;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring") --> optional if added <compilerArg> in pom file
@Mapper
public interface AddressMapper {

    AddressDto toDto(Address address);
    Address toEntity(AddressDto addressDto);
}

