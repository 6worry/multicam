package exam.di.setter;

public class OracleArticleDAO implements IArticleDAO {
	public void insert(ArticleDTO article) {
		System.out.println("Oracle");
	}
}