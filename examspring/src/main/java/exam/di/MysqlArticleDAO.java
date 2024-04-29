package exam.di;

public class MysqlArticleDAO implements IArticleDAO {
	public void insert(ArticleDTO article) {
		System.out.println("MySQL");
	}
}