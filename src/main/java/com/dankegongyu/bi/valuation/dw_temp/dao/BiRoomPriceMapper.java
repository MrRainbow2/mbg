package com.dankegongyu.bi.valuation.dw_temp.dao;

import com.dankegongyu.bi.valuation.dw_temp.model.BiRoomPrice;
import com.dankegongyu.bi.valuation.dw_temp.model.BiRoomPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiRoomPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int countByExample(BiRoomPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int deleteByExample(BiRoomPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int insert(BiRoomPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int insertSelective(BiRoomPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    List<BiRoomPrice> selectByExample(BiRoomPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    BiRoomPrice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BiRoomPrice record, @Param("example") BiRoomPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BiRoomPrice record, @Param("example") BiRoomPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BiRoomPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bi_room_price
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BiRoomPrice record);
}