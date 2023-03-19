package com.alliance.game.fakeWater.domain;

/**
 * 语义化接口
 * @author Alan
 * 
 * @param <T> 进行判断的类型
 */
public interface StatusSemanticization<T extends Comparable<T>> {

	/**
	 * 判断参数是否与当前实体符合等同概念
	 * @param t 实体
	 * @return true 二者等同.false 二者不相同
	 */
	public default boolean is(T t){
		return this.getStatus().compareTo(t)==0;
	}
	
	/**
	 * 判断参数是否不等同于当前实体
	 * @param t 实体
	 * @return true 二者不同. false 二者相同
	 */
	public default boolean notIs(T t){
		return this.getStatus().compareTo(t)!=0;
	}
	
	/**
	 * 给出状态的映射.请不要依赖具体的值进行编码
	 * @return 映射的值
	 */
	public T getStatus();
}
