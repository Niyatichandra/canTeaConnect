package canTeaConnect.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "menu")
public class menuItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="m_id")
    private Long mId;

    @Column(name = "r_id")
    private Long rId;
    @Column(name="i_id")
    private Long iId;

    private Double price;


    // Getters and Setters
    public Long getmId() { return mId; }
    public void setmId(Long mId) { this.mId = mId; }

    public Long getrId() { return rId; }
    public void setrId(Long rId) { this.rId = rId; }

    public Long getiId() { return iId; }
    public void setiId(Long iId) { this.iId = iId; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}
