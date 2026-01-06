package canTeaConnect.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<menuItems,Long> {
    @Query(value = "SELECT i.i_name as name, m.price as price FROM items i JOIN menu m ON i.i_id = m.i_id WHERE m.r_id = :rId", nativeQuery = true)
    List<Object[]> findMenuWithNames(@Param("rId") Long rId);
}
