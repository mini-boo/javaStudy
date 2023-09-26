package step02.lamda;

public class AestermarkImpl implements Aestermark {

	@Override
	public void addAestermark(String str1, String str2) {
		System.out.println(str1 + "*" + str2);
	}
}
