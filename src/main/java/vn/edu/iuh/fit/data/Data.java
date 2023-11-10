package vn.edu.iuh.fit.data;

public class Data {
//    @Autowired
//    private CandidateRepository candidateRepository;
//    @Autowired
//    private AddressRepository addressRepository;
//    @Autowired
//    private CompanyRepository companyRepository;
//    @Autowired
//    private SkillRepository skillRepository;
//    @Autowired
//    private CandidateSkillRepository candidateSkillRepository;
//    @Autowired
//    private JobRepository jobRepository;
//    @Autowired
//    private JobSkillRepository jobSkillRepository;
//    @Autowired
//    private ExperienceRepository experienceRepository;
//    @Bean
//    CommandLineRunner initData(){
//        return args -> {
//            Random rnd =new Random();
////            for (int i = 1; i < 1000; i++) {
////                Address add = new Address("Quang Trung","HCM",CountryCode.VN,rnd.nextInt(1,1000)+"",
////                        rnd.nextInt(70000,80000)+""  );
////                addressRepository.save(add);
////                Candidate can=new Candidate(
////                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
////                        "email_"+i+"@gmail.com","123","Name #"+i,
////                        rnd.nextLong(1111111111L,9999999999L)+"",add);
////                candidateRepository.save(can);
////                System.out.println("Added: " +can);
//
//
////                Address address = addressRepository.findById(rnd.nextLong(1,1000)).get();
////                Company company = new Company(
////                        "About Company #"+i,
////                        "email_"+i+"@company"+i+".com",
////                        "123",
////                        "Company Name "+i,
////                        rnd.nextLong(1111111111L,9999999999L)+"",
////                        "www.company"+i+".com",
////                        address);
////                companyRepository.save(company);
//
//
////            }
////            Skill skill = new Skill();
////            skill.setSkillName("Java");
////            skill.setSkillDescription("Java is a programming language and computing platform fiu have Java installed, om laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!");
////            skill.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill);
////
////            Skill skill2 = new Skill();
////            skill2.setSkillName("C++");
////            skill2.setSkillDescription("C++ is a general-purpose programming language  features in addition to facilities for low-level memory manipulation. It is almost always implemented amany platforms.");
////            skill2.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill2);
////
////            Skill skill3 = new Skill();
////            skill3.setSkillName("C#");
////            skill3.setSkillDescription("C# (pronounced see sharp, like the musical note C♯, but w strong tyss-based), and component-oriented programming disciplines. It was developed arounn Language Infrastructure.");
////            skill3.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill3);
////
////            Skill skill4 = new Skill();
////            skill4.setSkillName("Python");
////            skill4.setSkillDescription("Python is an interpreted, high-level whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.");
////            skill4.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill4);
////
////            Skill skill5 = new Skill();
////            skill5.setSkillName("PHP");
////            skill5.setSkillDescription("PHP: Hypertext Preprocessor (or simply PHP) is a general-purpose w stands for the recursive initialism PHP: Hypertext Preprocessor.[7]");
////            skill5.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill5);
////
////            Skill skill6 = new Skill();
////            skill6.setSkillName("JavaScript");
////            skill6.setSkillDescription("JavaScript (/ˈdʒɑːvəˌskrɪpt/),[8] often abbreviated as JS, is a programming the ECMAScript specification.[9] JavaScript is high-level, oftd first-class functions.");
////            skill6.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill6);
////
////            Skill skill7 = new Skill();
////            skill7.setSkillName("HTML");
////            skill7.setSkillDescription("Hypertext Markup Languagt can be assisted by technologies such as Cascading Style Sheets (CSS) and scripting languages such as JavaScript.");
////            skill7.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill7);
////
////            Skill skill8 = new Skill();
////            skill8.setSkillName("CSS");
////            skill8.setSkillDescription("Cascading Style Sheets (CSS) is ach as HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.[2]");
////            skill8.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill8);
////
////            Skill skill9 = new Skill();
////            skill9.setSkillName("SQL");
////            skill9.setSkillDescription("SQL (/ˌɛsˌkjuːˈɛl/ (About thigned for managing data held in a relational data stream management system (RDSMS).");
////            skill9.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill9);
////
////            Skill skill10 = new Skill();
////            skill10.setSkillName("C");
////            skill10.setSkillDescription("C (/siː/, as in the letter c). It has found lasting use in applications previously coded in assembly language. Such applications include operating systems and various application software for computer");
////            skill10.setType(SkillType.TECHNICAL_SKILL);
////            skillRepository.save(skill10);
//
////            Job job = new Job();
////            job.setJobName("Java Developer");
////            job.setJobDesc("Designing and implementing Java-based applications.");
////            job.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job);
////
////            Job job2 = new Job();
////            job2.setJobName("C++ Developer");
////            job2.setJobDesc("Designing and implementing C++-based applications.");
////            job2.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job2);
////
////            Job job3 = new Job();
////            job3.setJobName("C# Developer");
////            job3.setJobDesc("Designing and implementing C#-based applications.");
////            job3.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job3);
////
////            Job job4 = new Job();
////            job4.setJobName("Python Developer");
////            job4.setJobDesc("Designing and implementing Python-based applications.");
////            job4.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job4);
////
////            Job job5 = new Job();
////            job5.setJobName("PHP Developer");
////            job5.setJobDesc("Designing and implementing PHP-based applications.");
////            job5.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job5);
////
////            Job job6 = new Job();
////            job6.setJobName("JavaScript Developer");
////            job6.setJobDesc("Designing and implementing JavaScript-based applications.");
////            job6.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job6);
////
////            Job job7 = new Job();
////            job7.setJobName("HTML Developer");
////            job7.setJobDesc("Designing and implementing HTML-based applications.");
////            job7.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job7);
////
////            Job job8 = new Job();
////            job8.setJobName("CSS Developer");
////            job8.setJobDesc("Designing and implementing CSS-based applications.");
////            job8.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job8);
////
////            Job job9 = new Job();
////            job9.setJobName("SQL Developer");
////            job9.setJobDesc("Designing and implementing SQL-based applications.");
////            job9.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job9);
////
////            Job job10 = new Job();
////            job10.setJobName("C Developer");
////            job10.setJobDesc("Designing and implementing C-based applications.");
////            job10.setCompany(companyRepository.findById(rnd.nextLong(1000,1998)).get());
////            jobRepository.save(job10);
//
////            for (int i = 1; i < 1000; i++) {
////                Candidate candidate = candidateRepository.findById(rnd.nextLong(1,999)).get();
////                Skill skill = skillRepository.findById(rnd.nextLong(1,10)).get();
////                CandidateSkill candidateSkill = new CandidateSkill(
////                        "More Infos #"+i,
////                        SkillLevel.values()[rnd.nextInt(0,4)],
////                        skill,
////                        candidate
////                );
////                candidateSkillRepository.save(candidateSkill);
////            }
//
//
////            for (int i = 1; i < 1000; i++) {
////                JobSkill jobSkill = new JobSkill();
////                jobSkill.setMoreInfos("More Infos #"+i);
////                jobSkill.setSkillLevel(SkillLevel.values()[rnd.nextInt(0,4)]);
////                jobSkill.setSkill(skillRepository.findById(rnd.nextLong(1,10)).get());
////                jobSkill.setJob(jobRepository.findById(rnd.nextLong(1,10)).get());
////                jobSkillRepository.save(jobSkill);
////            }
////
////            for (int i = 1; i < 1000; i++) {
////                Experience experience = new Experience();
////                experience.setCompanyName("Company Name #"+i);
////                experience.setFromDate(LocalDate.of(rnd.nextInt(1990,2021),rnd.nextInt(1,13),rnd.nextInt(1,29)));
////                experience.setToDate(LocalDate.of(rnd.nextInt(1990,2021),rnd.nextInt(1,13),rnd.nextInt(1,29)));
////                experience.setCandidate(candidateRepository.findById(rnd.nextLong(1,1000)).get());
////                experience.setRole("Role #"+i);
////                experience.setWorkDescription("Work Description #"+i);
////                experienceRepository.save(experience);
////            }
//
//        };
//    }
}
