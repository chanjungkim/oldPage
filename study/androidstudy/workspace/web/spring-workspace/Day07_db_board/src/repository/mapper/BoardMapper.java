package repository.mapper;

import java.util.List;

import vo.ArticleVO;

//repository.mapper.BoardMapper
public interface BoardMapper {
	public ArticleVO select(int article_num);
	public ArticleVO update(int article_num);
	public int insert(ArticleVO article);
	public List<ArticleVO> selectAll();
	public List<ArticleVO> selectPage(int pageNum);
}
