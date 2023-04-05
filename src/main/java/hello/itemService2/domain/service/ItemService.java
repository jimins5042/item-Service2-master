package hello.itemService2.domain.service;

import hello.itemService2.domain.Mapper.ItemMapper;
import hello.itemService2.domain.item.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemMapper itemMapper;

    public List<Item> getAllUsers() {
        return itemMapper.findAll();
    }

    public void insertUser() {
        Item item = new Item();

        item.setItemName("kim");
        item.setPrice(2000);
        item.setQuantity(10);

        log.info("item = {} ", item);
        itemMapper.insertItem(item);
    }
}
