package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21{

	public static void main(String[] args) {
		//辞書クラスをインスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる単語の配列を作成
		String[] keyWords = {"apple","banana","grape","orange"};
		
		//配列の単語を辞書で調べる
		dictionary.checkWords(keyWords);
   }

	}


