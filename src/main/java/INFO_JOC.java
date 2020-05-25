public class INFO_JOC {

    private int id;
    private String name;
    private String description;
    private float price;
    private int categoryId;
    private String Seller;
    private String image;

    public INFO_JOC() {
    }

    public INFO_JOC(String name, String description, float price, int categoryId, String Seller) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.Seller = Seller;
    }

    public INFO_JOC(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getSeller() {
        return Seller;
    }

    public void setSeller(String Seller) {
        this.Seller = Seller;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



}
