package kr.co.farmstory.mapper;

import kr.co.farmstory.dto.ArticleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CropTalkMapper {

    public List<ArticleDTO> selectRecentArticles(String cate);

}
