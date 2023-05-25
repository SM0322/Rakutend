import java.util.Set;

@FunctionalInterface
// 関数おんたーフェイスの宣言
public interface PartyInfoConsumer {
  public abstract void process(set<Hero> party, Hero leader,String pName);
}