module onlineShop {
	exports onlineShop;
	exports onlineShop.dao;
	exports onlineShop.model;
	exports onlineShop.log;
	exports onlineShop.controller;
	exports onlineShop.service;

	requires com.fasterxml.jackson.annotation;
	requires hibernate.core;
	requires hibernate.jpa;
	requires java.naming;
	requires java.sql;
	requires javax.servlet.api;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.jdbc;
	requires spring.orm;
	requires spring.security.config;
	requires spring.security.core;
	requires spring.security.web;
	requires spring.tx;
	requires spring.web;
	requires spring.webmvc;
}