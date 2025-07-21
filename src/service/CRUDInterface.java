package service;

import dto.GirlDto;

import java.util.List;

public interface CRUDInterface {
    int insertData(GirlDto dto);

    int updateData(GirlDto dto);

    int deleteData(int id);

    List<GirlDto> getListAll();

    GirlDto findById(int id);

    List<GirlDto> searchList(String keyword);
}
