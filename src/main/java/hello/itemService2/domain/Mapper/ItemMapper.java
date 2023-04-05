package hello.itemService2.domain.Mapper;

import hello.itemService2.domain.item.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface ItemMapper {
    @Select("SELECT * FROM ITEM")
    List<Item> findAll();

    @Insert("insert into item(item_name, price, quantity) values (#{itemName}, #{price}, #{quantity})")
    void insertItem(Item item);
}

