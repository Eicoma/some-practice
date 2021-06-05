package eicoma.com.github.one_to_one;

import eicoma.com.github.bean.Card;

import java.util.List;

public interface CardMapper {
    //查询全部
    public abstract List<Card> selectAll();
}
