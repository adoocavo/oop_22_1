abstract class PairMap{
    protected String [] keyArray;
    protected String [] valueArray;
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{
    int index;
    public Dictionary(int size){
        keyArray = new String[size];
        valueArray = new String[size];
        index = 0;
    }

    String get(String key){
        for(int i = 0; i<keyArray.length; i++){
            if(key.equals(keyArray[i])){ return valueArray[i]; }
        }
        return null;
    }

    void put(String key, String value){
        boolean sameKeyCheck = false;
        int sameKeyIndex = 0;
        if(index != 0) {
            for (int i = 0; i < index; i++) {
                if (key.equals(keyArray[i])) {
                    sameKeyCheck = true;
                    sameKeyIndex = i;
                    break;
                }   }
        }
        if(sameKeyCheck){
            valueArray[sameKeyIndex] = value;           //sameKeyCheck가 true아니면 sameKeyIndex사용 안할건데 꼭 위에서 초기화 해야하나??
        }
        else{
        keyArray[index] = key;
        valueArray[index] = value;

        index++;
        }
    }

  String delete(String key){
      for(int i = 0; i<keyArray.length; i++){
          if(key.equals(keyArray[i])) {
              String delValue = valueArray[i];
              keyArray[i] = null;
              valueArray[i] = null;
              return delValue;
          }
      }
      return null;
  }
  int length(){
        return index+1;
  }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");

        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
