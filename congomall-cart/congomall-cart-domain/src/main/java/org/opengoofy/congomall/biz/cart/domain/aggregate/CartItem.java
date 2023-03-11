/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opengoofy.congomall.biz.cart.domain.aggregate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.opengoofy.congomall.ddd.framework.core.domain.AggregateRoot;

import java.math.BigDecimal;
import java.util.List;

/**
 * 购物车
 *
 * @author chen.ma
 * @github <a href="https://github.com/opengoofy" />
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartItem implements AggregateRoot {
    
    /**
     * id
     */
    private Long id;
    
    /**
     * 商品 spu id
     */
    private Long productId;
    
    /**
     * 商品 sku id
     */
    private Long productSkuId;
    
    /**
     * c 端用户 id
     */
    private Long customerUserId;
    
    /**
     * 商品图
     */
    private String productPic;
    
    /**
     * 商品名称
     */
    private String productName;
    
    /**
     * 商品品牌
     */
    private String productBrand;
    
    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    
    /**
     * 加购物车数量
     */
    private Integer productQuantity;
    
    /**
     * 商品规格，json 格式
     */
    private String productAttribute;
    
    /**
     * 选中标志
     */
    private Integer selectFlag;
    
    /**
     * 商品 sku ids
     */
    private List<String> productSkuIds;
}
