PGDMP         1                {         
   6monthcamp    10.23    10.23     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �
           1262    16467 
   6monthcamp    DATABASE     �   CREATE DATABASE "6monthcamp" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
    DROP DATABASE "6monthcamp";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            �
           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            �
           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16468    employee    TABLE     �   CREATE TABLE public.employee (
    emp_id bigint NOT NULL,
    emp_name character varying(255) NOT NULL,
    emp_age bigint NOT NULL,
    emp_salary bigint
);
    DROP TABLE public.employee;
       public         postgres    false    3            �            1259    16473    empolyee_emp_id_seq    SEQUENCE     �   ALTER TABLE public.employee ALTER COLUMN emp_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.empolyee_emp_id_seq
    START WITH 2
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public       postgres    false    196    3            �
          0    16468    employee 
   TABLE DATA               I   COPY public.employee (emp_id, emp_name, emp_age, emp_salary) FROM stdin;
    public       postgres    false    196   �       �
           0    0    empolyee_emp_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.empolyee_emp_id_seq', 93, true);
            public       postgres    false    197            o
           2606    16472    employee emp_id 
   CONSTRAINT     Q   ALTER TABLE ONLY public.employee
    ADD CONSTRAINT emp_id PRIMARY KEY (emp_id);
 9   ALTER TABLE ONLY public.employee DROP CONSTRAINT emp_id;
       public         postgres    false    196            �
   �   x�]��� Dg���*+��[�4U�f�
,Dߐ�����|�;y��8���>B۬��n:��|�\�ZXΛ�С���$�A�d�78%m2WG �U��O�`&��Y�Cүy�����'p�� c
�}֜��TM̼+!��>N��7�`?�     