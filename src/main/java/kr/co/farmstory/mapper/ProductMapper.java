package kr.co.farmstory.mapper;

import kr.co.farmstory.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;

@Mapper
public interface ProductMapper {
    Page<ProductDTO> selectAll();
    public void insertProduct(ProductDTO productDTO);
    public List<ProductDTO> selectProducts(String cate);

    public ProductDTO selectProduct(int pno);

}
