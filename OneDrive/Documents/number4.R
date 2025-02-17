#comment
library(tidyverse)

who <- read_csv("./world_health_organization.csv")



glimpse(who)

head(who)
head(who , 10)
tail(who, 7)

names(who)

who$Country

who$`CHE GDP(%)`


#ThisIsCamelCase

who <- who %>%
  rename(CHE_GDP_PCT = 'CHE GDP(%)')
who$CHE_GDP_PCT

names(who) <- str_to_lower(names(who))

summary(who)

who %>%
  summarize(n_distinct(country, na.rm=TRUE))

who %>%
  count(continent)

who %>% 
  filter(is.na(continent))

who %>%
  count(status)

who %>% 
  count(gdp)


who <- who %>%
  mutate(pop_mil= population/1000000)

who <- who %>% 
  mutate(gdp_mil= gdp/1000000 )

who <- who %>%
  mutate(gdp_per_cap = gdp/population)

who_africa <- who %>% 
  filter(continent == "Africa")

who_americas <- who %>%
  filter(continent == "North America" | continent == "South America")


who %>%
  filter(continent == "Europe"| status == "Developed")


who %>%
  filter(life_expectancy >80)

write_csv(who, "./who_clean.csv")

