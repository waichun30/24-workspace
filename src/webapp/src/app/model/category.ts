import {Product} from "./product";
import {Test2} from "./test2";

export interface Category {
  categoryName: String,
  categoryCode: String,
  productDTOList: Test2 []
}
