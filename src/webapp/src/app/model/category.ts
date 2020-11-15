import {Product} from "./product";

export interface Category {
  categoryName: String,
  categoryCode: String,
  productDTOList: Product []
}
