package hello.itemService2.web.basic;

import hello.itemService2.domain.item.Item;
import hello.itemService2.domain.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ItemController {


        private final ItemService itemService;

        @GetMapping("/users")
        public String AllUsers() {
            StringBuilder sb = new StringBuilder();
            List<Item> allUsers = itemService.getAllUsers();
            for (Item allUser : allUsers) {
                sb.append(allUser.getItemName() + " ");
            }
            return sb.toString();
        }

        @GetMapping("/insert")
        public String insertItem() {
            itemService.insertUser();
            return "DB에서 확인해보세요";
        }
    }

