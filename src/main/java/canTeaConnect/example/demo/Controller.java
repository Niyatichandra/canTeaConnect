package canTeaConnect.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping("/menu/{rId}") // This matches the "/menu/${id}" in your fetch
    public List<Object[]> getMenu(@PathVariable Long rId) {
        return menuItemRepository.findMenuWithNames(rId);
    }
}
