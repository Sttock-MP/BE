package management.sttock.productDto;

import lombok.*;
import management.sttock.domain.Product;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CreateProductRequestDto {

    @NotBlank
    private String category;
    @NotBlank
    private String name;
    private String discription;

    private LocalDate purchaseDate;
    private int purchaseAmount; //사용자 구매량
    private LocalDate expectedDate;
    private Float regularCapacity;//용량 - 1일 사용량

    //dto->entity
    public Product toEntity() {
        return Product.builder()
                .category(this.category)
                .name(this.name)
                .description(this.discription)
                .purchaseDate(this.purchaseDate)
                .purchaseAmount(this.purchaseAmount)
                .expectedDate(this.expectedDate)
                .regularCapacity(this.regularCapacity)
                .build();
    }
}
