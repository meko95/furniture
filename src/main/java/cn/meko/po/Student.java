package cn.meko.po;
import java.io.Serializable;
import java.util.*;

/**
*
*  @author author
*/
public class Student implements Serializable {

    private static final long serialVersionUID = 1547462049685L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String name;

    /**
    * 
    * isNullAble:1
    */
    private Integer age;

    /**
    * 
    * isNullAble:1
    */
    private Date birthday;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setAge(Integer age){this.age = age;}

    public Integer getAge(){return this.age;}

    public void setBirthday(Date birthday){this.birthday = birthday;}

    public Date getBirthday(){return this.birthday;}
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                "birthday='" + birthday + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Student set;

        private ConditionBuilder where;

        public UpdateBuilder set(Student set){
            this.set = set;
            return this;
        }

        public Student getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Student{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> ageList;

        public List<Integer> getAgeList(){return this.ageList;}

        private Integer ageSt;

        private Integer ageEd;

        public Integer getAgeSt(){return this.ageSt;}

        public Integer getAgeEd(){return this.ageEd;}

        private List<Date> birthdayList;

        public List<Date> getBirthdayList(){return this.birthdayList;}

        private Date birthdaySt;

        private Date birthdayEd;

        public Date getBirthdaySt(){return this.birthdaySt;}

        public Date getBirthdayEd(){return this.birthdayEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder ageBetWeen(Integer ageSt,Integer ageEd){
            this.ageSt = ageSt;
            this.ageEd = ageEd;
            return this;
        }

        public QueryBuilder ageGreaterEqThan(Integer ageSt){
            this.ageSt = ageSt;
            return this;
        }
        public QueryBuilder ageLessEqThan(Integer ageEd){
            this.ageEd = ageEd;
            return this;
        }


        public QueryBuilder age(Integer age){
            setAge(age);
            return this;
        }

        public QueryBuilder ageList(Integer ... age){
            this.ageList = solveNullList(age);
            return this;
        }

        public QueryBuilder ageList(List<Integer> age){
            this.ageList = age;
            return this;
        }

        public QueryBuilder fetchAge(){
            setFetchFields("fetchFields","age");
            return this;
        }

        public QueryBuilder excludeAge(){
            setFetchFields("excludeFields","age");
            return this;
        }

        public QueryBuilder birthdayBetWeen(Date birthdaySt,Date birthdayEd){
            this.birthdaySt = birthdaySt;
            this.birthdayEd = birthdayEd;
            return this;
        }

        public QueryBuilder birthdayGreaterEqThan(Date birthdaySt){
            this.birthdaySt = birthdaySt;
            return this;
        }
        public QueryBuilder birthdayLessEqThan(Date birthdayEd){
            this.birthdayEd = birthdayEd;
            return this;
        }


        public QueryBuilder birthday(Date birthday){
            setBirthday(birthday);
            return this;
        }

        public QueryBuilder birthdayList(Date ... birthday){
            this.birthdayList = solveNullList(birthday);
            return this;
        }

        public QueryBuilder birthdayList(List<Date> birthday){
            this.birthdayList = birthday;
            return this;
        }

        public QueryBuilder fetchBirthday(){
            setFetchFields("fetchFields","birthday");
            return this;
        }

        public QueryBuilder excludeBirthday(){
            setFetchFields("excludeFields","birthday");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Student build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> ageList;

        public List<Integer> getAgeList(){return this.ageList;}

        private Integer ageSt;

        private Integer ageEd;

        public Integer getAgeSt(){return this.ageSt;}

        public Integer getAgeEd(){return this.ageEd;}

        private List<Date> birthdayList;

        public List<Date> getBirthdayList(){return this.birthdayList;}

        private Date birthdaySt;

        private Date birthdayEd;

        public Date getBirthdaySt(){return this.birthdaySt;}

        public Date getBirthdayEd(){return this.birthdayEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder ageBetWeen(Integer ageSt,Integer ageEd){
            this.ageSt = ageSt;
            this.ageEd = ageEd;
            return this;
        }

        public ConditionBuilder ageGreaterEqThan(Integer ageSt){
            this.ageSt = ageSt;
            return this;
        }
        public ConditionBuilder ageLessEqThan(Integer ageEd){
            this.ageEd = ageEd;
            return this;
        }


        public ConditionBuilder ageList(Integer ... age){
            this.ageList = solveNullList(age);
            return this;
        }

        public ConditionBuilder ageList(List<Integer> age){
            this.ageList = age;
            return this;
        }

        public ConditionBuilder birthdayBetWeen(Date birthdaySt,Date birthdayEd){
            this.birthdaySt = birthdaySt;
            this.birthdayEd = birthdayEd;
            return this;
        }

        public ConditionBuilder birthdayGreaterEqThan(Date birthdaySt){
            this.birthdaySt = birthdaySt;
            return this;
        }
        public ConditionBuilder birthdayLessEqThan(Date birthdayEd){
            this.birthdayEd = birthdayEd;
            return this;
        }


        public ConditionBuilder birthdayList(Date ... birthday){
            this.birthdayList = solveNullList(birthday);
            return this;
        }

        public ConditionBuilder birthdayList(List<Date> birthday){
            this.birthdayList = birthday;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Student obj;

        public Builder(){
            this.obj = new Student();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder age(Integer age){
            this.obj.setAge(age);
            return this;
        }
        public Builder birthday(Date birthday){
            this.obj.setBirthday(birthday);
            return this;
        }
        public Student build(){return obj;}
    }

}
