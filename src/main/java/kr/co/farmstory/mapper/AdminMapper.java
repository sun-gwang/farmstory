package kr.co.farmstory.mapper;

import kr.co.farmstory.dto.ProductDTO;
import kr.co.farmstory.dto.UserDTO;
import kr.co.farmstory.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    public void insertAdmin(UserDTO userDTO);


    // adminIndex 회원 목록 출력
    public List<UserDTO> adminIdxUsers();

    // admin.user.list 출력
    public List<UserDTO> adminSelectUsers();

    // admin.user.modify 출력
    public UserDTO adminSelectUserByUid(String uid);

    // adminIndex 상품 목록 표시
    public List<ProductDTO> adminIdxProducts();

    // adminProduct 상품 목록
    public List<ProductDTO> adminSelectProducts();

    public void adminUserDelete(String uid);

    public void adminProductDelete(int pno);


}
