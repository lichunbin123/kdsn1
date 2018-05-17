package com.usping.kdsn.mapper;

import com.usping.kdsn.bean.Comment;
import com.usping.kdsn.bean.CommentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.dao.DataAccessException;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    long countByExample(CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int deleteByExample(CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int deleteByPrimaryKey(Integer commentId) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int insert(Comment record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int insertSelective(Comment record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    List<Comment> selectByExampleWithBLOBs(CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    List<Comment> selectByExample(CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    Comment selectByPrimaryKey(Integer commentId) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByPrimaryKeySelective(Comment record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByPrimaryKeyWithBLOBs(Comment record) throws DataAccessException;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Sat Nov 25 12:44:12 CET 2017
     */
    int updateByPrimaryKey(Comment record) throws DataAccessException;

    Comment selectByUserIdAndNewsId(@Param("userId") int userId, @Param("newsId") String newsId) throws DataAccessException;

    List<Comment> selectByNewsId(@Param("newsId") String newsId) throws DataAccessException;
}